package java_study.day15;

public enum TrafficLight {

    RED {
        @Override
        public TrafficLight next() {
            return GREEN;
        }

        public boolean canGo() {
            return false;
        }
    },
    YELLOW {
        @Override
        public TrafficLight next() {
            return RED;
        }

        public boolean canGo() {
            return false;
        }

    },
    GREEN {
        @Override
        public TrafficLight next() {
            return YELLOW;
        }

        public boolean canGo() {
            return true;
        }
    };

    public abstract TrafficLight next();   // RED → GREEN → YELLOW → RED

    public abstract boolean canGo();       // tylko GREEN → true
}
