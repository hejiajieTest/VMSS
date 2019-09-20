package com.tscloud.manager.controller.impl;

import javax.annotation.Resource;
import javax.ws.rs.Path;

import org.springframework.stereotype.Controller;

import com.tscloud.common.framework.rest.impl.BaseRestServerInterfaceImplNoDubbo;
import com.tscloud.common.framework.service.IBaseInterfaceService;
import com.tscloud.manager.controller.IManualInfoController;
import com.tscloud.manager.entity.ManualInfo;
import com.tscloud.manager.service.IManualService;

@Controller
@Path(value = "/manualInfo")
public class ManualInfoController  extends BaseRestServerInterfaceImplNoDubbo<ManualInfo> implements IManualInfoController{
	@Resource
	private IManualService manualService ;
	
	@Override
	public IBaseInterfaceService<ManualInfo> getBaseInterface() {
		return manualService;
	}
	
}
