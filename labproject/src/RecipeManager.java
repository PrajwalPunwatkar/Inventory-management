import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class RecipeManager {
    private List<Recipe> recipes;

    public RecipeManager() {
        recipes = new ArrayList<>();
    }

    public void addRecipe(Recipe recipe) {
        recipes.add(recipe);
    }

    public List<Recipe> searchByName(String name) {
        List<Recipe> found = new ArrayList<>();
        for (Recipe recipe : recipes) {
            if (recipe.getName().toLowerCase().contains(name.toLowerCase())) {
                found.add(recipe);
            }
        }
        return found;
    }

    public List<Recipe> searchByIngredient(String ingredient) {
        List<Recipe> found = new ArrayList<>();
        for (Recipe recipe : recipes) {
            if (recipe.getIngredients().stream().anyMatch(i -> i.toLowerCase().contains(ingredient.toLowerCase()))) {
                found.add(recipe);
            }
        }
        return found;
    }

    public void saveRecipesToFile(String filename) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(recipes);
        }
    }

    @SuppressWarnings("unchecked")
    public void loadRecipesFromFile(String filename) throws IOException, ClassNotFoundException {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            recipes = (List<Recipe>) ois.readObject();
        }
    }

    public List<Recipe> getRecipes() {
        return recipes;
    }
}