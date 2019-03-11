class RecordHolder {
    private double[] weight;
    private int lifeTime;
    private int ERR;

    RecordHolder(double[] weight, int lifeTime, int ERR){
        this.weight = weight;
        this.lifeTime = lifeTime;
        this.ERR = ERR;
    }

    void setERR(int ERR) {
        this.ERR = ERR;
    }

    double getERR() {
        return ERR;
    }

    public void setWeight(double[] weight) {
        this.weight = weight;
    }

    public double[] getWeight() {
        return weight;
    }

    public void setLifeTime(int lifeTime) {
        this.lifeTime = lifeTime;
    }

    public int getLifeTime() {
        return lifeTime;
    }
}
