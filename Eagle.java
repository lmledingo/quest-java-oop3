public class Eagle extends Bird implements Fly{

    private boolean flying;
    private int altitude;

    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }

    public int getAltitude() {
        return altitude;
    }

    public boolean isFlying() {
        return flying;
    }

    @Override
    public String sing() {
        return "Screech!";
    
    }

    @Override
    public void takeOff() {  
        if (!this.flying && this.altitude <= 0) {
            this.flying = true;
            System.out.printf("%s take off in the air.%n", this.getName());
        }
    }
    /** 
     *@param meters
     *@return 
    */
    @Override
    public int descend(int meters) {
        if (this.flying) {
            this.altitude = Math.min(this.altitude - meters, 325);
            System.out.printf("%s fly down, altitude : %d%n", this.getName(), this.altitude);
        }
        return this.altitude;

}
     /**
     * swin upward
     * @param meters depths decrease
     * @return depth
     */
    @Override
    public int ascend(int meters) {
        this.flying = true;
        if (this.flying) {
            this.altitude = Math.max(this.altitude + meters, 0);
            System.out.printf("%s fly upward, altitude : %d%n", this.getName(), this.altitude);
        }
        return this.altitude;
    }
    @Override
    public void land() {
        if (this.flying && this.altitude <= 1) {
            System.out.printf("%s landing%n", this.getName());
        } else {
            System.out.printf("%s is to high, it can't land.%n", this.getName());
        }
    }
    @Override
    public void glide(){
        System.out.println("glide into the air");
    }
}

