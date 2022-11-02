package com.order.service;

import java.util.List;

import com.order.model.Restorent;

public interface RestorentService {

	List<Restorent> getAllRestorents();

	Restorent getRestorentById(long id);

}
