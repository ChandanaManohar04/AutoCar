package autocar;

public class CarSm {
    public static void main(String args[])
    {
        Car cr1=new Car("BMW",2998);
        System.out.println(" " +cr1.getManufacturer()+" "+cr1.getEnginecapacity());

        Car cr2=new Car();
        cr2.setManufacturer("Maruthi Suzuki");
        cr2.setEnginecapacity(2000);
        System.out.println(" "+cr2.getManufacturer()+" "+cr2.getEnginecapacity());

        Suv s1=new Suv("BMW",2373,"225/50 R17 98Y");
        System.out.println(" "+s1.getManufacturer()+" "+s1.getEnginecapacity()+" "+s1.getTyresize());

        Suv s2=new Suv("225/50 R17 98Y");
        System.out.println(" "+s1.getTyresize());


        Suv s3=new Suv();
        s3.setManufacturer("Honda");
        s3.setEnginecapacity(1500);
       // s3.setTyresize("175/70 R14 84H");
        System.out.println(" " +s3.getManufacturer()+" "+s3.getEnginecapacity()+" "+s3.getTyresize());
    }
    }



