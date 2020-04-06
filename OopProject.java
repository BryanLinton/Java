
public class OopProject{
    
    private String name;
    private String description;
    private double initialCost = 0;
    
    private static String defaultName = "Name not Given";
    private static String defaultDescription = "No Description";

    public void setName(String name) { this.name = name; }
    public void setDescription(String description) { this.description = description; }
    public void setInitialCost(double initialCost) { this.initialCost = initialCost; }

    public String getName() {return this.name;}
    public String getDescription(){return this.description;}
    public double getInitialCost(){return this.initialCost;}


    public OopProject() {
        setName(defaultName);
        setDescription(defaultDescription);
    }

    public OopProject(String name) {
        setName(name);
        setDescription(defaultDescription);
    }

    public OopProject(String name, String description) {
        setName(name);
        setDescription(description);
    }

    public OopProject(String name, String description, double initialCost){
        setName(name);
        setDescription(description);
        setInitialCost(initialCost);
    }

    public void elevatorPitch(){
        System.out.println("Project: " + name +  " (Cost): " + initialCost + ": " + " Description: " + description);
    }
}
