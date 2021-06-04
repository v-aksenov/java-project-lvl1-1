package hexlet.code.games;

public enum GameSelector {

    EVEN {
        @Override
        public IGame select() {
            return new Even();
        }
    },

    CALCULATOR {
        @Override
        public IGame select() {
            return new Calculator();
        }
    },

    GCD {
        @Override
        public IGame select() {
            return new GCD();
        }
    },

    PROGRESSION {
        @Override
        public IGame select() {
            return new Progression();
        }
    },

    PRIME {
        @Override
        public IGame select() {
            return new Prime();
        }
    };

    public abstract IGame select();
}
