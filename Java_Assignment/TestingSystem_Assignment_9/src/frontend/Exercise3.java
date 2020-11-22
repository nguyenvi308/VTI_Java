package frontend;

import entity.CPU;
import entity.Car;


public class Exercise3 {

    public static void main(String[] args) {

        // Question 1
        CPU cpu = new CPU(100.0);
        CPU.Ram ram = cpu.new Ram(4,"Intel");
        CPU.Processor processor  = cpu.new Processor(4,"Intel");
        System.out.println(cpu + "  " + ram + "  " + processor);


        // Question 2
        Car mazda = new Car("Mazda", "8WD","Engine 1" );
        //Car.Engine engine  = mazda.new Engine("Something");
        //System.out.println(engine.getEngineType());
        mazda.printInfo();







    }
}
