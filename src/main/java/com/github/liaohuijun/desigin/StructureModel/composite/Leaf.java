package com.github.liaohuijun.desigin.StructureModel.composite;
/**
 * 叶子节点
  * (用一句话描述类的主要功能)
  * @author LIAO  
  * @date 2018年1月12日
 */
public class Leaf extends Component{

	public Leaf(String name) {
		super(name);
	}
	
	@Override
	public void doSomething() {
		System.out.println(name);
		
	}

	@Override
	public void addChild(Component child) {
		throw new UnsupportedOperationException("叶子节点没有子节点");
		
	}

	@Override
	public void removeChild(Component child) {
		throw new UnsupportedOperationException("叶子节点没有子节点");
		
	}

	@Override
	public Component getChild(int index) {


		throw new UnsupportedOperationException("叶子节点没有子节点");
		
	}

	
}

