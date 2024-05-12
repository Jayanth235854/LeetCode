class ParkingSystem {
    int lar,med,sma;
    public ParkingSystem(int big, int medium, int small) {
        lar=big;
        med=medium;
        sma=small;
    }
    public boolean addCar(int carType) {
        if(carType==1 && lar>0){
            lar--;
            return true;
        }else if(carType==2 && med>0){
            med--;
            return true;
        }else if(carType==3 && sma>0){
            sma--;
            return true;
        }else return false;
    }
}