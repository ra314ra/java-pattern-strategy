package com.ra314ra.pattern.strategy;

enum Strategy {

    PLUS {
        @Override
        public int compute(int x, int y) {
            return x + y;
        }
    },
    MINUS {
        @Override
        public int compute(int x, int y) {
            return x - y;
        }
    },
    MULTIPLY {
        @Override
        public int compute(int x, int y) {
            return x * y;
        }
    },
    DIVIDE {
        @Override
        public int compute(int x, int y) {
            return x / y;
        }
    };

    public int compute(int x, int y) {
        return 0;
    }

}


