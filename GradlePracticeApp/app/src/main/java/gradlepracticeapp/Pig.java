package gradlepracticeapp;

import interfaceCom.Animal;

//Pig "implements" the Animal interface
class Pig implements Animal {

	private String name;

	public void sleep() {
		
		System.out.println("Zzz");
	}

	@Override
	public void animalSound() {
		
		
	}
	
	public void setName(String s) {
		this.name=s+" setName";
		
	}

	public String getMessagel() {
		return name;
	}

	@Override
	public int add(int a, int b) {
		// TODO 自動生成されたメソッド・スタブ
		 return a + b;
	}

	@Override
	public int minaus(int a, int b) {
		// TODO 自動生成されたメソッド・スタブ
		 return a - b;
	}
	


}
