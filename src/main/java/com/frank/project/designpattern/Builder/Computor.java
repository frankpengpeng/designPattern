package com.frank.project.designpattern.Builder;

public class Computor {
    private String cpu;
    private String mainBoard;
    private String screen;
    private String keyBoard;
    private String memory;

    public Computor(String cpu,
                    String mainBoard,
                    String screen,
                    String keyBoard,
                    String memory){
        this.cpu = cpu;
        this.mainBoard = mainBoard;
        this.screen = screen;
        this.keyBoard = keyBoard;
        this.memory = memory;
    }

    public static class Builder {
        private String cpu;
        private String mainBoard;
        private String screen;
        private String keyBoard;
        private String memory;

        public Builder setCpu(String cpu) {
            this.cpu = cpu;
            return this;
        }

        public Builder setMainBoard(String mainBoard) {
            this.mainBoard = mainBoard;
            return this;
        }

        public Builder setScreen(String screen) {
            this.screen = screen;
            return this;
        }

        public Builder setKeyBoard(String keyBoard) {
            this.keyBoard = keyBoard;
            return this;
        }

        public Builder setMemory(String memory) {
            this.memory = memory;
            return this;
        }

        public Computor build(){
            return new Computor(this.cpu,
                    this.mainBoard,
                    this.screen,
                    this.keyBoard,
                    this.memory);
        }
    }

    @Override
    public String toString() {
        return "Computor{" +
                "cpu='" + cpu + '\'' +
                ", mainBoard='" + mainBoard + '\'' +
                ", screen='" + screen + '\'' +
                ", keyBoard='" + keyBoard + '\'' +
                ", memory='" + memory + '\'' +
                '}';
    }
}
