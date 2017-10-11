package com.zeratul;

import java.io.IOException;

public class DependentBean {
	private ResourceBean resourceBean;

	public void write(String ss) throws IOException {
		System.out.println("DependentBean:=======д��Դ");
		resourceBean.getFos().write(ss.getBytes());
	}

	// ��ʼ������
	public void init() throws IOException {
		System.out.println("DependentBean:=======��ʼ��");
		resourceBean.getFos().write("DependentBean:=======��ʼ��=====".getBytes());
	}

	// ���ٷ���
	public void destroy() throws IOException {
		System.out.println("DependentBean:=======����");
		// ������֮ǰ��Ҫ���ļ���д��������
		resourceBean.getFos().write("DependentBean:=======����=====".getBytes());
	}
	
	public DependentBean() {
	}

	public DependentBean(ResourceBean resourceBean) {
		this.resourceBean = resourceBean;
	}

	public ResourceBean getResourceBean() {
		return resourceBean;
	}

	public void setResourceBean(ResourceBean resourceBean) {
		this.resourceBean = resourceBean;
	}
	
	
	
}
