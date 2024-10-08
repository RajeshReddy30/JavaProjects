package com.xworkz.task2.runner;

public class DeepCloning implements Cloneable {
   public  String name;
    public Address address; 

   public  static class Address {
        String city;
        String state;

        public Address(String city, String state) {
            this.city = city;
            this.state = state;
        }

        @Override
        public String toString() {
            return "Address{city=" + city + ", state=" + state + "}";
        }
    }

    public DeepCloning(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        DeepCloning cloned = (DeepCloning) super.clone();
        cloned.address = new Address(this.address.city, this.address.state); 
        return cloned;
    }

    @Override
    public String toString() {
        return "DeepCloning{name=" + name + ", address=" + address + "}";
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Address address = new Address("Bengaluru", "Karnataka");
        DeepCloning original = new DeepCloning("Sneha", address);
        DeepCloning clone = (DeepCloning) original.clone();

        System.out.println("Original: " + original);
        System.out.println("Clone: " + clone);

        clone.address.city = "Chennai"; 
        System.out.println("After modification:");
        System.out.println("Original: " + original);
        System.out.println("Clone: " + clone);
    }
}


