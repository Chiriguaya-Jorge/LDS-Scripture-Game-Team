/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ldsScriptureGame.model;


import byui.cit260.ldsScriptureGame.enums.Character;
import java.io.Serializable;
import java.util.ArrayList;
/**
 *
 * @author hp
 */
public class Location {
    private int row;
    private int column;
    private boolean visited;
    private Scene scene;
    private ArrayList<Character> characters;


    public Location(int row, int column, Scene scene, ArrayList<Character> characters) {
        this.row = row;
        this.column = column;
        this.visited = false;
        this.scene = scene;
        this.characters = characters;
    }


    public Location() {
        this.characters = new ArrayList<Character>();
    }

    public Location(int row, int column) {
        this.row = row;
        this.column = column;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public Scene getScene() {
        return scene;
    }

    public void setScene(Scene scene) {
        this.scene = scene;
    }

    public ArrayList<Character> getCharacters() {
        return characters;
    }

    public void setCharacters(ArrayList<Character> characters) {
        this.characters = characters;
    }

    public void removeCharacter(Character character) {
        if (character == null) {
            return;
        }
        this.characters.remove(character);
    }


    public void addCharacter(Character character) {
        if (character == null || this.characters.contains(character)) {
            return;
        }

        this.characters.add(character);
    }


    @Override
    public String toString() {
        return "Location{" + "row=" + row + ", column=" + column + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + this.row;
        hash = 67 * hash + this.column;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Location other = (Location) obj;
        if (this.row != other.row) {
            return false;
        }
        if (this.column != other.column) {
            return false;
        }
        return true;
    }

}
