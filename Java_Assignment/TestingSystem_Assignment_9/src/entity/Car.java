package entity;

public class Car {
    private String name;
    private String type;
            public class Engine
            {
                private String engineType;
                public Engine(String engineType) {
                    this.engineType = engineType;
                }
                public String getEngineType() {
                    return engineType;
                }
                public void setEngineType(String engineType) {
                    this.engineType = engineType;
                }
                @Override
                public String toString() {
                    return engineType ;
                }
            }
            // Constructor of Car
            public Car(String name, String type, String typeEngine) {
                this.name = name;
                this.type = type;
                Engine engine  = new Engine(typeEngine);
                System.out.println(engine.getEngineType());
            }
            public String getName() {
                return name;
            }
            public void setName(String name) {
                this.name = name;
            }
            public String getType() {
                return type;
            }
            public void setType(String type) {
                this.type = type;
            }

    public void printInfo()
    {
        //Engine engine = new Engine("Engine 1");
        System.out.println("Name : " + name ) ;
        System.out.println("Type : " + getType());
        //System.out.println(engine.getEngineType());
    }


}
