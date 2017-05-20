package com.naah.services.interfaces;

import java.util.List;

import com.naah.PO.Areas;

public interface County
{

	public abstract List<Areas> SelCounty(String id);

	/* (non-Javadoc)
	 * @see com.naah.services.implement.Area#UpdArea(com.naah.PO.Areas)
	 */
	/* (non-Javadoc)
	 * @see com.naah.services.implement.County#UpdArea(com.naah.PO.Areas)
	 */

	public abstract void UpdCounty(Areas countrys);

	/* (non-Javadoc)
	 * @see com.naah.services.implement.Area#DelArea(com.naah.PO.Areas)
	 */
	/* (non-Javadoc)
	 * @see com.naah.services.implement.County#DelArea(com.naah.PO.Areas)
	 */

	public abstract void DelCounty(Areas countrys);

	/* (non-Javadoc)
	 * @see com.naah.services.implement.Area#InsArea(com.naah.PO.Areas)
	 */
	/* (non-Javadoc)
	 * @see com.naah.services.implement.County#InsArea(com.naah.PO.Areas)
	 */
	public abstract void InsArea(Areas countrys);

	public abstract List<Areas> SelOneCounty(String areaid,String id);
}