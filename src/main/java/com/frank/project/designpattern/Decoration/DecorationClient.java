package com.frank.project.designpattern.Decoration;

public class DecorationClient {

    public static void main(String[] args) {
        Actor actor = new Actor();
        ActorDecoration decoration = new ActorDecoration(actor);
        actor.palyRole();
        decoration.singAsong();
    }
}
