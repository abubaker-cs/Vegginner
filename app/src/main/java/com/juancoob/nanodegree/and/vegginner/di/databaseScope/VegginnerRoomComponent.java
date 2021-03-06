package com.juancoob.nanodegree.and.vegginner.di.databaseScope;

import com.juancoob.nanodegree.and.vegginner.di.VegginnerAppComponent;
import com.juancoob.nanodegree.and.vegginner.ui.MainActivity;
import com.juancoob.nanodegree.and.vegginner.ui.places.PlacesFrament;
import com.juancoob.nanodegree.and.vegginner.ui.recipeDetails.RecipeDetailsFragment;
import com.juancoob.nanodegree.and.vegginner.ui.recipeDetails.RecipeIngredientsServingsFragment;
import com.juancoob.nanodegree.and.vegginner.ui.recipes.RecipesFragment;
import com.juancoob.nanodegree.and.vegginner.widget.VegginnerShoppingListProvider;
import com.juancoob.nanodegree.and.vegginner.widget.VegginnerShoppingListService;

import dagger.Component;

/**
 * This is the Room component which connects modules and depends on VegginnerAppComponent
 *
 * Created by Juan Antonio Cobos Obrero on 28/07/18.
 */

@RoomScope
@Component(modules = VegginnerRoomModule.class, dependencies = VegginnerAppComponent.class)
public interface VegginnerRoomComponent {

    // Main activity
    void injectMainActivity(MainActivity mainActivity);

    // Recipes
    void injectRecipesSection(RecipesFragment recipesFragment);
    void injectRecipeDetailsSection(RecipeDetailsFragment recipeDetailsFragment);
    void injectRecipeIngredientsServingsFragment(RecipeIngredientsServingsFragment recipeIngredientsServingsFragment);
    void injectVegginnerShoppingListProvider(VegginnerShoppingListProvider vegginnerShoppingListProvider);
    void injectVegginnerRemoteViewFactory(VegginnerShoppingListService.VegginnerRemoteViewFactory vegginnerRemoteViewFactory);

    // Places
    void injectPlacesSection(PlacesFrament placesFrament);

}
