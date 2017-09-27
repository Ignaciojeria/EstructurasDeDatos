package main.celular;

public class MockClienteCelular {
	
	private ClienteCelularService clienteCelularService=ClienteCelularService.getInstance();
	
	public void initData() {
		clienteCelularService.add(new ClienteCelular("18666636-4","Ignacio",23,'M',true,new Celular(87467587,"Apple")));
		clienteCelularService.add(new ClienteCelular("34562347-2","Dante",21,'M',true,new Celular(28437467,"Sony")));
		clienteCelularService.add(new ClienteCelular("27424689-6","Isaac",22,'M',true,new Celular(29837485,"Samsung")));
		clienteCelularService.add(new ClienteCelular("12123463-1","Maria",16,'F',true,new Celular(84198238,"Apple")));
		clienteCelularService.add(new ClienteCelular("11232132-7","Juan",29,'M',true,new Celular(198273485,"Sony")));
		clienteCelularService.add(new ClienteCelular("51235123-8","Pedro",42,'M',true,new Celular(28471823,"Sony")));
		clienteCelularService.add(new ClienteCelular("12351233-2","Bastian",12,'M',true,new Celular(1823949,"Samsung")));
	}
	
}
