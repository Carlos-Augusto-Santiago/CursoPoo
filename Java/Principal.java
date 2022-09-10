class Principal {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        UberX uberX = new UberX("AMQ123", new Account("Andres Herrera", "AND123", "hola", "pass"), "Chevrolet", "Sonic"); 
        uberX.setPassenger(4);               
        uberX.printDataCar();    
        
        UberVan uberVan = new UberVan("AMQ123", new Account("Andres Herrera", "AND123", "hola", "pass"));
        uberVan.setPassenger(6);
        uberVan.printDataCar();

        // Car car2 = new Car("QWE567", new Account("Andrea Herrera", "ANDA876"));        
        // car2.passenger = 3;     
        // car2.printDataCar();   
    }
}