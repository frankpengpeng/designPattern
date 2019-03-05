package com.frank.project.designpattern.Decoration;

public class ActorDecoration {
    private Actor actor;
    public ActorDecoration(Actor actor) {
        this.actor = actor;
    }

    public void singAsong() {
        System.out.println("可以唱歌");
    }
}
