package com.cts.reftypes;

public class Scores {
    private double maths;
    public double getMaths() {
        return maths;
    }
    @Override
    public String toString() {
        return "Scores [maths=" + maths + ", physics=" + physics + ", chemistry=" + chemistry + "]";
    }
    public void setMaths(double maths) {
        this.maths = maths;
    }
    public double getPhysics() {
        return physics;
    }
    public void setPhysics(double physics) {
        this.physics = physics;
    }
    public double getChemistry() {
        return chemistry;
    }
    public void setChemistry(double chemistry) {
        this.chemistry = chemistry;
    }
    private double physics;
    private double chemistry;
}
