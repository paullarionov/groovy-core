/** 
 * Tests the use of returns in Groovy
 * 
 * @author <a href="mailto:james@coredevelopers.net">James Strachan</a>
 * @version $Revision$
 */
class ReturnTest extends GroovyTestCase {
    void testIntegerReturnValues() {
        value = foo(5)
        assert value == 10
    }

    void testBooleanReturnValues() {
        value = bar(6)
        assert value
    }

    def foo(x) {
        return ( x * 2 )
    }

    def bar(x) {
        return x > 5
    }
    
    void testVoidReturn() {
        explicitVoidReturn()
        implicitVoidReturn()
        explicitVoidReturnWithoutFinalReturn()
        implicitVoidReturnWithoutFinalReturn()
    }

    void explicitVoidReturn() {
        return
    }

    def implicitVoidReturn() {
        return
    }

    void explicitVoidReturnWithoutFinalReturn() {
        return;
        x = 4;
        if (x == 3) {
            return;
        } else {
            try {
                x = 3;
                return;
            } finally {
                //do nothing
            }
        }
    }

    def implicitVoidReturnWithoutFinalReturn() {
        x = 4;
        if (x == 3) {
            return;
        } else {
            try {
                x = 3;
                return;
            } finally {
                //do nothing
            }
        }
    } 
}
