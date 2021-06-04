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
    },

    PRIME {
        @Override
        public Game select() {
            return new Prime();
        }
    };

    public abstract Game select();
}
