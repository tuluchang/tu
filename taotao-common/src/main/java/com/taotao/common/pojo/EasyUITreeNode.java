package com.taotao.common.pojo;

import java.io.Serializable;

public class EasyUITreeNode implements Serializable {
	
	private Long id;//节点的id值  
	private String text;//节点的文本值 ：就是商品的类目的名称
	private String state;//状态  closed:是一个父节点    open：叶子节点
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}

	
}
