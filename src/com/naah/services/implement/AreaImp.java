package com.naah.services.implement;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.naah.DAO.implement.Delete;
import com.naah.DAO.implement.Insert;
import com.naah.DAO.implement.Select;
import com.naah.DAO.implement.Update;
import com.naah.PO.Areas;
import com.naah.PO.Users;
import com.naah.services.interfaces.Area;

@Service("Area")	
@Transactional
public class AreaImp implements Area  {

	/* (non-Javadoc)
	 * @see com.naah.services.implement.Login#Login(com.naah.PO.Users)
	 */
	private Select Sel;
	private Update Upd;
	private Insert Ins;
	private Delete Del;
	

	/* (non-Javadoc)
	 * @see com.naah.services.implement.Area#SelArea()
	 */
	@Override
	public List<Areas> SelArea()
	{
		List<Areas> areas=new ArrayList<>();
		String sql="from Areas where isCity='1'";
		areas=Sel.HSQL(sql);
		return areas;
	}
	@Override
	public List<Areas> SelOneArea(String id)
	{
		List<Areas> areas=new ArrayList<>();
		String sql="from Areas where isCity='1' and areaId='"+id+"'";
		areas=Sel.HSQL(sql);
		return areas;
	}
	/* (non-Javadoc)
	 * @see com.naah.services.implement.Area#UpdArea(com.naah.PO.Areas)
	 */
	@Override
	public void UpdArea(Areas areas)
	{
		Areas a=(Areas) Sel.getHQL(Areas.class, areas.getAreaId());
		System.out.println(areas.getAreaName());
		a.setAreaName(areas.getAreaName());
		a.setAreaParent(null);
		a.setIsCity("1");
		Upd.UPD(a);
	}
	/* (non-Javadoc)
	 * @see com.naah.services.implement.Area#DelArea(com.naah.PO.Areas)
	 */
	@Override
	public void DelArea(Areas areas)
	{
		Areas a=(Areas) Sel.getHQL(Areas.class, areas.getAreaId());
		Del.Delhql("Delete from Areas where areaParent='"+areas.getAreaId()+"'");
		Del.DEL(a);
	}
	/* (non-Javadoc)
	 * @see com.naah.services.implement.Area#InsArea(com.naah.PO.Areas)
	 */
	@Override
	public void InsArea(Areas areas)
	{
		areas.setAreaParent(null);
		areas.setIsCity("1");
		Ins.INS(areas);
	}

	@Resource(name="sel")
	public void setSel(Select Sel) {
		this.Sel = Sel;
	}

	@Resource(name="upd")
	public void setUpd(Update upd) {
		Upd = upd;
	}

	@Resource(name="ins")
	public void setIns(Insert ins) {
		Ins = ins;
	}

	@Resource(name="del")
	public void setDel(Delete del) {
		Del = del;
	}

}
