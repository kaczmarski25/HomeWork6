package geekbrains_home_work;


    abstract class Animals {

        protected String name;
        protected String animal;
        protected int limRunning;
        protected int limSwimming;

        public Animals (String name){
            this.name = name;

        }

        public void run(int dist) {
            if (this.limRunning >= dist) System.out.println(this.animal + " " + this.name + " пробегает: " + dist + " м. Лимит в " + limRunning + "м не превышен");
            else System.out.println(this.animal + " " + this.name + " не может бежать так далеко: " + dist + " м. У " + this.animal + " лимит на бег в " + this.limRunning + " м. Полоса препятствий не пройдена");
        }

        public void swim(int dist) {
            if (this.limSwimming >=  dist && dist != 0) System.out.println(this.animal + " " + this.name + " проплывает: " + dist + " м. Лимит в " + limSwimming + "м не превышен");
            else if (dist == 0 ) System.out.println("В полосе препятствий для " + this.animal + " " + this.name +" нет команды плыть. Повезло ");
            else System.out.println(this.animal + " " + this.name + " не доплыл до конца полосы препятствий . Потеряли питомца" );
        }

    }

