package com.basis.java8;

class GenericClass<X> {
	X name;

	public void setName(X name) {
		this.name = name;
	}

	public X getName(){  
      return name;  
    }

	public String genericMethod(GenericClass<String> x){  
      x.setName("John");  
      return x.name;  
    }
}

public class TypeInferenceExample {
	public static void main(String[] args) {
		GenericClass<String> genericClass = new GenericClass<String>();
		genericClass.setName("Peter");  
		System.out.println(genericClass.getName());  //Peter

		GenericClass<String> genericClass2 = new GenericClass<>();
		genericClass2.setName("peter");
		System.out.println(genericClass2.getName()); //peter

		// New improved type inference
		System.out.println(genericClass2.genericMethod(new GenericClass<>())); //John
		
	}
}