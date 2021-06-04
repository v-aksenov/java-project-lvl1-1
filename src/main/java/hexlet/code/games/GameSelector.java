package hexlet.code.games;

public enum GameSelector {

    EVEN {
        @Override
        public Game select() {
            return new Even();
        }
    },

    CALCULATOR {
        @Override
        public Game select() {
            return new Calculator();
        }
    },

    GCD {
        @Override
        public Game select() {
            return new GCD();
        }
    },

    PROGRESSION {
        @Override
        public Game select() {
            return new Progression();
        }
    };

    public abstract Game select();
}
