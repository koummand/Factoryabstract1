package com.factoryabstract;

public class ProduitFactory1  extends ProduitFactory{

	@Override
	protected ProduitA createProduitA() {
		
		return new ProduitA1();
	}

}
