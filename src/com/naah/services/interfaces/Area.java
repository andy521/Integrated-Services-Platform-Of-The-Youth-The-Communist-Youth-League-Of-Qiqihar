package com.naah.services.interfaces;

import java.util.List;

import com.naah.PO.Areas;

public interface Area {

	public abstract List<Areas> SelArea();

	public abstract void UpdArea(Areas areas);

	public abstract void DelArea(Areas areas);

	public abstract void InsArea(Areas areas);

	public abstract List<Areas> SelOneArea(String id);

}