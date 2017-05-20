package com.naah.services.implement;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.naah.DAO.implement.Delete;
import com.naah.DAO.implement.Insert;
import com.naah.DAO.implement.Select;
import com.naah.DAO.implement.Update;
import com.naah.PO.Areas;
import com.naah.services.interfaces.County;

@Service("County")
@Transactional
public class CountyImp implements County
{

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
	/* (non-Javadoc)
	 * @see com.naah.services.implement.County#SelArea()
	 */

	/* (non-Javadoc)
	 * @see com.naah.services.implement.County#SelCounty(java.lang.String)
	 */
	@Override
	public List<Areas> SelCounty(String id)
	{
		List<Areas> countrys = new ArrayList<>();
		String sql = "from Areas where isCity='0' and areaParent='" + id + "'";
		countrys = Sel.HSQL(sql);
		return countrys;
	}

	@Override
	public List<Areas> SelOneCounty(String areaid,String id)
	{
		List<Areas> County = new ArrayList<>();
		String sql = "from Areas where isCity='1' and areaParent='" + areaid + "' and id='" + id + "'";
		County = Sel.HSQL(sql);
		return County;
	}

	/* (non-Javadoc)
	 * @see com.naah.services.implement.Area#UpdArea(com.naah.PO.Areas)
	 */
	/* (non-Javadoc)
	 * @see com.naah.services.implement.County#UpdArea(com.naah.PO.Areas)
	 */

	/* (non-Javadoc)
	 * @see com.naah.services.implement.County#UpdCounty(com.naah.PO.Areas)
	 */
	@Override
	public void UpdCounty(Areas countrys)
	{
		Areas a = (Areas) Sel.getHQL(Areas.class, countrys.getAreaId());
		System.out.println(countrys.getAreaName());
		a.setAreaName(countrys.getAreaName());
		Upd.UPD(a);
	}

	/* (non-Javadoc)
	 * @see com.naah.services.implement.Area#DelArea(com.naah.PO.Areas)
	 */
	/* (non-Javadoc)
	 * @see com.naah.services.implement.County#DelArea(com.naah.PO.Areas)
	 */

	/* (non-Javadoc)
	 * @see com.naah.services.implement.County#DelCounty(com.naah.PO.Areas)
	 */
	@Override
	public void DelCounty(Areas countrys)
	{
		Areas a = (Areas) Sel.getHQL(Areas.class, countrys.getAreaId());
		Del.DEL(a);
	}

	/* (non-Javadoc)
	 * @see com.naah.services.implement.Area#InsArea(com.naah.PO.Areas)
	 */
	/* (non-Javadoc)
	 * @see com.naah.services.implement.County#InsArea(com.naah.PO.Areas)
	 */
	/* (non-Javadoc)
	 * @see com.naah.services.implement.County#InsArea(com.naah.PO.Areas)
	 */
	@Override
	public void InsArea(Areas countrys)
	{
		countrys.setIsCity("0");
		Ins.INS(countrys);
	}

	@Resource(name = "sel")
	public void setSel(Select Sel)
	{
		this.Sel = Sel;
	}

	@Resource(name = "upd")
	public void setUpd(Update upd)
	{
		Upd = upd;
	}

	@Resource(name = "ins")
	public void setIns(Insert ins)
	{
		Ins = ins;
	}

	@Resource(name = "del")
	public void setDel(Delete del)
	{
		Del = del;
	}

}
