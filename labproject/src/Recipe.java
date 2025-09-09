import java.io.Serializable;
import java.util.List;

public class Recipe implements Serializable {
    private String name;
    private List<String> ingredients;
    private List<String> steps;
    private String cookingTime;
    private String category;

    public Recipe(String name, List<String> ingredients, List<String> steps, String cookingTime, String category) {
        this.name = name;
        this.ingredients = ingredients;
        this.steps = steps;
        this.cookingTime = cookingTime;
        this.category = category;
    }

    // Getters and Setters
    public String getName() { return name; }
    public List<String> getIngredients() { return ingredients; }
    public List<String> getSteps() { return steps; }
    public String getCookingTime() { return cookingTime; }
    public String getCategory() { return category; }
}
