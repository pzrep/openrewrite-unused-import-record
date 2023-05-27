package pzrep.p2;

import pzrep.p1.Record;
import pzrep.p1.*;

class Client1 {
    void f(Record r) {
      A a = r.theOne();
      B0 b0 = r.theOther0();
      B1 b1 = r.theOther1();
    }
}

