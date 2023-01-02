import java.util.ArrayList;

public class LightStrip {
    ArrayList<Light> lightStrip = new ArrayList<Light>();
    private double totalHeatOutput;
    private double totalLightOutput;
    private int numFluorescent;

    public LightStrip() {
        totalHeatOutput = 0;
        totalLightOutput = 0;
        numFluorescent = 0;
    }
    public void addLight(Incandescent incandescent) {
        lightStrip.add(incandescent);
    }

    public void addLight(Fluorescent fluorescent) {
        lightStrip.add(fluorescent);
    }

    public int countFluorescents() {
        numFluorescent = 0;
        for (int j = 0; j < lightStrip.size(); j++) {
            if (lightStrip.get(j).isFluorescent()) {
                numFluorescent ++;
            }
        }
        return numFluorescent;
    }
    public double getTotalHeatOutput() {
        totalHeatOutput = 0;
        for (int i = 0; i < lightStrip.size(); i++) {
            totalHeatOutput = totalHeatOutput + lightStrip.get(i).heatOutput();
        }
        return totalHeatOutput;
    }
    public double getTotalLightOutput() {
        totalLightOutput = 0;
        for (int i = 0; i < lightStrip.size(); i++) {
            totalLightOutput += lightStrip.get(i).getLumens();
        }
        return totalLightOutput;
    }
    public void display() {
        for (int i = 0; i < lightStrip.size(); i++) {
            System.out.println(i + ": " + lightStrip.get(i).toString());
        }
        System.out.println("Total lumens = " + getTotalLightOutput());
        System.out.println("Flourescent = " + countFluorescents());
        System.out.println("Heat output = " + getTotalHeatOutput());
    }
    public void removeLight(int index) {
        if (index < lightStrip.size()) {
            lightStrip.remove(index);
        } else {
            System.out.println("Error: No light at that index");
        }
    }
}
