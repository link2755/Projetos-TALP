package main;
import cyanruntime.*;

import cyan.lang.*;


@SuppressWarnings( { "unused", "cast", "hiding" } )
public final class _ProgramMP extends _Any
 {

	private static final long serialVersionUID = 3197293862831464960L;
    static { 
        try {

          _ProgramMP.prototype = new _ProgramMP();
        }
        catch ( ExceptionInInitializerError e ) {
            System.out.println("Probably this prototype is referenced indirectly in a method called " + 
"in its 'init' method. This " + 
"happens in this example:\n" + 
"    object InitError\n" + 
"        func init { \n" + 
"            MakeError accessInitError;\n" + 
"        }\n" + 
"    end\n" + 
"Method 'accessInitError' is just\n" + 
"    func accessInitError { \n" + 
"        InitError prototypeName println; \n" + 
"    }\n" + 
"Then InitError is referenced before the 'init' " + 
"method has built the object that represents the " + 
"prototype"); 
       }

    }
    private     cyan.lang._Any _d;

    public     _ProgramMP() {
    main._Dummy tmp488 = new main._Dummy( );

    this._d = tmp488;

        } 

    public main._ProgramMP _new() {
         
            return new _ProgramMP();        
        } 

    public CyString  _toJson_1( _Any _obj )  {

        CyString _json;
        _json = (new CyString("{\n"));
        _Array_LT_GP_CyString_GT tmp489 = new _Array_LT_GP_CyString_GT( new CyInt(3) );
        tmp489._add_1( (new CyString("getFeatureListNameDoesNotCollide__")));
        tmp489._add_1( (new CyString("getAnnotListNameDoesNotCollide__")));
        tmp489._add_1( (new CyString("getSlotFeatureListNameDoesNotCollide__")));

        _Array_LT_GP_CyString_GT _excludedGets;
        _excludedGets = tmp489;
            {
            CyString _methodSignature;
            _Array_LT_GP_CyString_GT tmp490 = _obj._getMethodNameList();
            _Iterator_LT_GP_CyString_GT tmp491 = tmp490._iterator();
            while ( tmp491._hasNext().b ) { 
                _methodSignature = tmp491._next();
                CyBoolean tmp492 = _methodSignature._startsWith_1( (new CyString("get")));
                if ( tmp492.b ) {
                    CyString tmp493 = this.___getMethodName_1( _methodSignature);

                    CyString _methodName;
                    _methodName = tmp493;
                    CyBoolean tmp494 = _methodName._notin_1( _excludedGets);
                    if ( tmp494.b ) {
                        String tmp496 =  CyanRuntime.getJavaNameOfUnaryMethod(((CyString ) _methodName).s);
                        java.lang.reflect.Method tmp497 = CyanRuntime.getJavaMethodByName(_obj.getClass(), tmp496, 0);
                        if ( tmp497 == null ) { tmp497 = CyanRuntime.getJavaMethodByName(_obj.getClass(), "_methodName", 0); }
                        Object tmp498 = null;
                        if ( tmp497 != null ) { 
                            try {
                                tmp497.setAccessible(true);
                                if ( tmp497.getReturnType() == void.class ) {
                                    tmp498 = _Nil.prototype;
                                    tmp497.invoke(_obj);
                                }
                                else {
                                    tmp498 = tmp497.invoke(_obj);
                                }
                            }
                            catch ( java.lang.reflect.InvocationTargetException tmp499 ) {
                            	Throwable t__ = tmp499.getCause();
                            	if ( t__ instanceof ExceptionContainer__ ) {
                                	throw new ExceptionContainer__( ((ExceptionContainer__) t__).elem );
                            	}
                            	else
                            		throw new ExceptionContainer__( new _ExceptionJavaException(t__));
                            }
                            catch (IllegalAccessException | IllegalArgumentException tmp499) {
                                    throw new ExceptionContainer__( new _ExceptionDoesNotUnderstand(_methodName ) );
                            }
                        }
                        else { 
                            //	func doesNotUnderstand: (String methodName, Array<Array<Dyn>> args)
                            java.lang.reflect.Method tmp500 = CyanRuntime.getJavaMethodByName(_obj.getClass(), "_doesNotUnderstand_2", 2);
                            if ( tmp500 == null ) {
                                throw new ExceptionContainer__( new _ExceptionDoesNotUnderstand(new CyString("doesNotUnderstand") ) );
                            }
                            try {
                                _Array_LT_GP__Array_LT_GP_Object_GT_GT arrayArrayParam = new _Array_LT_GP__Array_LT_GP_Object_GT_GT();
                                _Array_LT_GP_Object_GT arrayParam = new _Array_LT_GP_Object_GT();
                                arrayArrayParam._add_1( arrayParam );
                                tmp500.setAccessible(true);
                                tmp498 = tmp500.invoke(_obj, _methodName, arrayArrayParam);
                            }
                            catch ( java.lang.reflect.InvocationTargetException tmp501 ) {
                            	Throwable t__ = tmp501.getCause();
                            	if ( t__ instanceof ExceptionContainer__ ) {
                                	throw new ExceptionContainer__( ((ExceptionContainer__) t__).elem );
                            	}
                            	else
                            		throw new ExceptionContainer__( new _ExceptionJavaException(t__));
                            }
                            catch (IllegalAccessException | IllegalArgumentException tmp501) {
                                    throw new ExceptionContainer__( new _ExceptionDoesNotUnderstand(new CyString(tmp496) ) );
                            }
                        }

                        Object _value;
                        _value = tmp498;
                        java.lang.reflect.Method tmp503 = CyanRuntime.getJavaMethodByName(_value.getClass(), "_getMethodNameList", 0);
                        if ( tmp503 == null ) { tmp503 = CyanRuntime.getJavaMethodByName(_value.getClass(), "getMethodNameList", 0); }
                        Object tmp504 = null;
                        if ( tmp503 != null ) { 
                            try {
                                tmp503.setAccessible(true);
                                if ( tmp503.getReturnType() == void.class ) {
                                    tmp504 = _Nil.prototype;
                                    tmp503.invoke(_value);
                                }
                                else {
                                    tmp504 = tmp503.invoke(_value);
                                }
                            }
                            catch ( java.lang.reflect.InvocationTargetException tmp505 ) {
                            	Throwable t__ = tmp505.getCause();
                            	if ( t__ instanceof ExceptionContainer__ ) {
                                	throw new ExceptionContainer__( ((ExceptionContainer__) t__).elem );
                            	}
                            	else
                            		throw new ExceptionContainer__( new _ExceptionJavaException(t__));
                            }
                            catch (IllegalAccessException | IllegalArgumentException tmp505) {
                                    throw new ExceptionContainer__( new _ExceptionDoesNotUnderstand(new CyString("getMethodNameList") ) );
                            }
                        }
                        else { 
                            //	func doesNotUnderstand: (String methodName, Array<Array<Dyn>> args)
                            java.lang.reflect.Method tmp506 = CyanRuntime.getJavaMethodByName(_value.getClass(), "_doesNotUnderstand_2", 2);
                            if ( tmp506 == null ) {
                                throw new ExceptionContainer__( new _ExceptionDoesNotUnderstand(new CyString("doesNotUnderstand") ) );
                            }
                            try {
                                _Array_LT_GP__Array_LT_GP_Object_GT_GT arrayArrayParam = new _Array_LT_GP__Array_LT_GP_Object_GT_GT();
                                _Array_LT_GP_Object_GT arrayParam = new _Array_LT_GP_Object_GT();
                                arrayArrayParam._add_1( arrayParam );
                                tmp506.setAccessible(true);
                                tmp504 = tmp506.invoke(_value, new CyString("getMethodNameList"), arrayArrayParam);
                            }
                            catch ( java.lang.reflect.InvocationTargetException tmp507 ) {
                            	Throwable t__ = tmp507.getCause();
                            	if ( t__ instanceof ExceptionContainer__ ) {
                                	throw new ExceptionContainer__( ((ExceptionContainer__) t__).elem );
                            	}
                            	else
                            		throw new ExceptionContainer__( new _ExceptionJavaException(t__));
                            }
                            catch (IllegalAccessException | IllegalArgumentException tmp507) {
                                    throw new ExceptionContainer__( new _ExceptionDoesNotUnderstand(new CyString("_getMethodNameList") ) );
                            }
                        }
                        java.lang.reflect.Method tmp509 = null;
                        tmp509 = CyanRuntime.getJavaMethodByName(tmp504.getClass(), "_contains_1", 1);
                            if ( tmp509 == null ) { tmp509 = CyanRuntime.getJavaMethodByName(tmp504.getClass(), "contains", 1); }
                        Object tmp510 = null;
                        if ( tmp509 != null ) { 
                            try {
                                tmp509.setAccessible(true);
                                if ( tmp509.getReturnType() == void.class ) {
                                    tmp510 = _Nil.prototype;
                                    tmp509.invoke(tmp504, (new CyString("toJson: Any -> String")));
                                }
                                else {
                                    tmp510 = tmp509.invoke(tmp504, (new CyString("toJson: Any -> String")));
                                }
                            }
                            catch ( java.lang.reflect.InvocationTargetException tmp511 ) {
                            	Throwable t__ = tmp511.getCause();
                            	if ( t__ instanceof ExceptionContainer__ ) {
                                	throw new ExceptionContainer__( ((ExceptionContainer__) t__).elem );
                            	}
                            	else
                            		throw new ExceptionContainer__( new _ExceptionJavaException(t__));
                            }
                            catch (IllegalAccessException | IllegalArgumentException tmp511) {
                                    throw new ExceptionContainer__( new _ExceptionDoesNotUnderstand(new CyString("contains:") ) );
                            }
                        }
                        else { 
                            //	func doesNotUnderstand: (String methodName, Array<Array<Dyn>> args)
                            java.lang.reflect.Method tmp512 = CyanRuntime.getJavaMethodByName(tmp504.getClass(), "_doesNotUnderstand_2", 2);
                            if ( tmp512 == null ) {
                                throw new ExceptionContainer__( new _ExceptionDoesNotUnderstand(new CyString("doesNotUnderstand") ) );
                            }
                            try {
                                _Array_LT_GP__Array_LT_GP_Object_GT_GT arrayArrayParam = new _Array_LT_GP__Array_LT_GP_Object_GT_GT();
                                _Array_LT_GP_Object_GT arrayParam = new _Array_LT_GP_Object_GT();
                                arrayParam._add_1((new CyString("toJson: Any -> String")));
                                arrayArrayParam._add_1( arrayParam );
                                tmp512.setAccessible(true);
                                tmp510 = tmp512.invoke(tmp504, new CyString("contains:"), arrayArrayParam);
                            }
                            catch ( java.lang.reflect.InvocationTargetException tmp513 ) {
                            	Throwable t__ = tmp513.getCause();
                            	if ( t__ instanceof ExceptionContainer__ ) {
                                	throw new ExceptionContainer__( ((ExceptionContainer__) t__).elem );
                            	}
                            	else
                            		throw new ExceptionContainer__( new _ExceptionJavaException(t__));
                            }
                            catch (IllegalAccessException | IllegalArgumentException tmp513) {
                                    throw new ExceptionContainer__( new _ExceptionDoesNotUnderstand(new CyString("_contains_1") ) );
                            }
                        }
                        if ( !(tmp510 instanceof CyBoolean) ) {
                            throw new ExceptionContainer__(new _ExceptionCast( new CyString("Cannot cast expression 'value getMethodNameList contains: \"toJson: Any -> String\"' to 'cyan.lang.Boolean' in line 31 of file ProgramMP.cyan") ) );
                        }
                        if ( ((CyBoolean ) tmp510).b ) {
                            /* json = json ++ "\t" ++ methodName ++ ": " ++ value toJson ++ "\n" */
                            CyString tmp514 = _json._plus_plus( (new CyString("\t")));
                            CyString tmp515 = tmp514._plus_plus( _methodName);
                            CyString tmp516 = tmp515._plus_plus( (new CyString(": ")));
                            java.lang.reflect.Method tmp519 = CyanRuntime.getJavaMethodByName(_value.getClass(), "_toJson", 0);
                            if ( tmp519 == null ) { tmp519 = CyanRuntime.getJavaMethodByName(_value.getClass(), "toJson", 0); }
                            Object tmp520 = null;
                            if ( tmp519 != null ) { 
                                try {
                                    tmp519.setAccessible(true);
                                    if ( tmp519.getReturnType() == void.class ) {
                                        tmp520 = _Nil.prototype;
                                        tmp519.invoke(_value);
                                    }
                                    else {
                                        tmp520 = tmp519.invoke(_value);
                                    }
                                }
                                catch ( java.lang.reflect.InvocationTargetException tmp521 ) {
                                	Throwable t__ = tmp521.getCause();
                                	if ( t__ instanceof ExceptionContainer__ ) {
                                    	throw new ExceptionContainer__( ((ExceptionContainer__) t__).elem );
                                	}
                                	else
                                		throw new ExceptionContainer__( new _ExceptionJavaException(t__));
                                }
                                catch (IllegalAccessException | IllegalArgumentException tmp521) {
                                        throw new ExceptionContainer__( new _ExceptionDoesNotUnderstand(new CyString("toJson") ) );
                                }
                            }
                            else { 
                                //	func doesNotUnderstand: (String methodName, Array<Array<Dyn>> args)
                                java.lang.reflect.Method tmp522 = CyanRuntime.getJavaMethodByName(_value.getClass(), "_doesNotUnderstand_2", 2);
                                if ( tmp522 == null ) {
                                    throw new ExceptionContainer__( new _ExceptionDoesNotUnderstand(new CyString("doesNotUnderstand") ) );
                                }
                                try {
                                    _Array_LT_GP__Array_LT_GP_Object_GT_GT arrayArrayParam = new _Array_LT_GP__Array_LT_GP_Object_GT_GT();
                                    _Array_LT_GP_Object_GT arrayParam = new _Array_LT_GP_Object_GT();
                                    arrayArrayParam._add_1( arrayParam );
                                    tmp522.setAccessible(true);
                                    tmp520 = tmp522.invoke(_value, new CyString("toJson"), arrayArrayParam);
                                }
                                catch ( java.lang.reflect.InvocationTargetException tmp523 ) {
                                	Throwable t__ = tmp523.getCause();
                                	if ( t__ instanceof ExceptionContainer__ ) {
                                    	throw new ExceptionContainer__( ((ExceptionContainer__) t__).elem );
                                	}
                                	else
                                		throw new ExceptionContainer__( new _ExceptionJavaException(t__));
                                }
                                catch (IllegalAccessException | IllegalArgumentException tmp523) {
                                        throw new ExceptionContainer__( new _ExceptionDoesNotUnderstand(new CyString("_toJson") ) );
                                }
                            }
                            _Any tmp524;
                            if ( tmp520 instanceof _Any ) 
                                tmp524 = (_Any ) tmp520;
                            else
                                throw new ExceptionContainer__(new _ExceptionCast( new CyString("Cannot cast expression 'value toJson' to 'cyan.lang.Any' in line 33 of file ProgramMP.cyan") ) );
                            CyString tmp517 = tmp516._plus_plus( tmp524);
                            CyString tmp525 = tmp517._plus_plus( (new CyString("\n")));
                            _json = tmp525;
                        }
                        else {
                            /* json = json ++ "\t" ++ methodName ++ ": " ++ obj `methodName ++ "\n" */
                            CyString tmp526 = _json._plus_plus( (new CyString("\t")));
                            CyString tmp527 = tmp526._plus_plus( _methodName);
                            CyString tmp528 = tmp527._plus_plus( (new CyString(": ")));
                            String tmp531 =  CyanRuntime.getJavaNameOfUnaryMethod(((CyString ) _methodName).s);
                            java.lang.reflect.Method tmp532 = CyanRuntime.getJavaMethodByName(_obj.getClass(), tmp531, 0);
                            if ( tmp532 == null ) { tmp532 = CyanRuntime.getJavaMethodByName(_obj.getClass(), "_methodName", 0); }
                            Object tmp533 = null;
                            if ( tmp532 != null ) { 
                                try {
                                    tmp532.setAccessible(true);
                                    if ( tmp532.getReturnType() == void.class ) {
                                        tmp533 = _Nil.prototype;
                                        tmp532.invoke(_obj);
                                    }
                                    else {
                                        tmp533 = tmp532.invoke(_obj);
                                    }
                                }
                                catch ( java.lang.reflect.InvocationTargetException tmp534 ) {
                                	Throwable t__ = tmp534.getCause();
                                	if ( t__ instanceof ExceptionContainer__ ) {
                                    	throw new ExceptionContainer__( ((ExceptionContainer__) t__).elem );
                                	}
                                	else
                                		throw new ExceptionContainer__( new _ExceptionJavaException(t__));
                                }
                                catch (IllegalAccessException | IllegalArgumentException tmp534) {
                                        throw new ExceptionContainer__( new _ExceptionDoesNotUnderstand(_methodName ) );
                                }
                            }
                            else { 
                                //	func doesNotUnderstand: (String methodName, Array<Array<Dyn>> args)
                                java.lang.reflect.Method tmp535 = CyanRuntime.getJavaMethodByName(_obj.getClass(), "_doesNotUnderstand_2", 2);
                                if ( tmp535 == null ) {
                                    throw new ExceptionContainer__( new _ExceptionDoesNotUnderstand(new CyString("doesNotUnderstand") ) );
                                }
                                try {
                                    _Array_LT_GP__Array_LT_GP_Object_GT_GT arrayArrayParam = new _Array_LT_GP__Array_LT_GP_Object_GT_GT();
                                    _Array_LT_GP_Object_GT arrayParam = new _Array_LT_GP_Object_GT();
                                    arrayArrayParam._add_1( arrayParam );
                                    tmp535.setAccessible(true);
                                    tmp533 = tmp535.invoke(_obj, _methodName, arrayArrayParam);
                                }
                                catch ( java.lang.reflect.InvocationTargetException tmp536 ) {
                                	Throwable t__ = tmp536.getCause();
                                	if ( t__ instanceof ExceptionContainer__ ) {
                                    	throw new ExceptionContainer__( ((ExceptionContainer__) t__).elem );
                                	}
                                	else
                                		throw new ExceptionContainer__( new _ExceptionJavaException(t__));
                                }
                                catch (IllegalAccessException | IllegalArgumentException tmp536) {
                                        throw new ExceptionContainer__( new _ExceptionDoesNotUnderstand(new CyString(tmp531) ) );
                                }
                            }
                            _Any tmp537;
                            if ( tmp533 instanceof _Any ) 
                                tmp537 = (_Any ) tmp533;
                            else
                                throw new ExceptionContainer__(new _ExceptionCast( new CyString("Cannot cast expression 'obj `methodName' to 'cyan.lang.Any' in line 36 of file ProgramMP.cyan") ) );
                            CyString tmp529 = tmp528._plus_plus( tmp537);
                            CyString tmp538 = tmp529._plus_plus( (new CyString("\n")));
                            _json = tmp538;
                        }
                        // end of if
                    }
                    // end of if
                }
                // end of if
            }
        }
        /* json = json ++ "}" */
        CyString tmp539 = _json._plus_plus( (new CyString("}")));
        _json = tmp539;

        return _json;
        } 

    public CyString  ___getMethodName_1( CyString _methodSignature )  {
        CyInt tmp540 = _methodSignature._indexOf_1( (new CyChar(':')));

        CyInt _indexDoubleDot;
        _indexDoubleDot = tmp540;
        CyBoolean tmp541 = _indexDoubleDot._greaterThan_equal( CyInt.zero);
        if ( tmp541.b ) {

            return (new CyString(""));
        }
        // end of if
        CyInt tmp542 = _methodSignature._indexOf_1( (new CyChar(' ')));

        CyInt _indexWhiteSpace;
        _indexWhiteSpace = tmp542;
        CyBoolean tmp543 = _indexWhiteSpace._lessThan_equal( CyInt.zero);
        if ( tmp543.b ) {

            return (new CyString(""));
        }
        // end of if
        CyString tmp544 = _methodSignature._substring_2( CyInt.zero, _indexWhiteSpace);

        return tmp544;
        } 

    public _Any _getSomething4() {
        return _d;
        } 

    public void _ex3() {
        main._Program tmp545 = new main._Program( );

        main._Program _p;
        _p = tmp545;
            {
            CyString _methodSignature;
            _Array_LT_GP_CyString_GT tmp546 = _p._getMethodNameList();
            _Iterator_LT_GP_CyString_GT tmp547 = tmp546._iterator();
            while ( tmp547._hasNext().b ) { 
                _methodSignature = tmp547._next();
                _Nil tmp548 = _Nil.prototype;
                _methodSignature._println();
            }
        }
        return ;
        } 

    public void _ex2() {
            {
            CyString _op;
            _Array_LT_GP_CyString_GT tmp549 = new _Array_LT_GP_CyString_GT( new CyInt(4) );
            tmp549._add_1( (new CyString("+")));
            tmp549._add_1( (new CyString("-")));
            tmp549._add_1( (new CyString("*")));
            tmp549._add_1( (new CyString("/")));
            _Iterator_LT_GP_CyString_GT tmp550 = tmp549._iterator();
            while ( tmp550._hasNext().b ) { 
                _op = tmp550._next();
                    {
                    CyInt _a;
                    _Interval_LT_GP_CyInt_GT tmp551 = CyInt.one._dot_dot( (new CyInt( (int ) 10)));
                    _Iterator_LT_GP_CyInt_GT tmp552 = tmp551._iterator();
                    while ( tmp552._hasNext().b ) { 
                        _a = tmp552._next();
                            {
                            CyInt _b;
                            _Interval_LT_GP_CyInt_GT tmp553 = CyInt.one._dot_dot( (new CyInt( (int ) 10)));
                            _Iterator_LT_GP_CyInt_GT tmp554 = tmp553._iterator();
                            while ( tmp554._hasNext().b ) { 
                                _b = tmp554._next();
                                CyDouble tmp556 = _a._asDouble();
                                CyDouble tmp558 = _b._asDouble();
                                String tmp559 = "";
                                tmp559 += ((CyString ) _op).s;
                                char tmp560 = tmp559.charAt(0);
                                if ( (tmp560 == '_' || Character.isAlphabetic(tmp560) ) && !tmp559.endsWith(":") ) { tmp559 += ":"; }
                                String tmp561 =  CyanRuntime.getJavaNameOfMethod(new String[] { ((CyString ) _op).s }, new int[] {1} );
                                java.lang.reflect.Method tmp562 = null;
                                tmp562 = CyanRuntime.getJavaMethodByName(tmp556.getClass(), tmp561, 1);
                                Object tmp563 = null;
                                if ( tmp562 != null ) { 
                                    try {
                                        tmp562.setAccessible(true);
                                        if ( tmp562.getReturnType() == void.class ) {
                                            tmp563 = _Nil.prototype;
                                            tmp562.invoke(tmp556, tmp558);
                                        }
                                        else {
                                            tmp563 = tmp562.invoke(tmp556, tmp558);
                                        }
                                    }
                                    catch ( java.lang.reflect.InvocationTargetException tmp564 ) {
                                    	Throwable t__ = tmp564.getCause();
                                    	if ( t__ instanceof ExceptionContainer__ ) {
                                        	throw new ExceptionContainer__( ((ExceptionContainer__) t__).elem );
                                    	}
                                    	else
                                    		throw new ExceptionContainer__( new _ExceptionJavaException(t__));
                                    }
                                    catch (IllegalAccessException | IllegalArgumentException tmp564) {
                                            throw new ExceptionContainer__( new _ExceptionDoesNotUnderstand(new CyString(tmp559) ) );
                                    }
                                }
                                else { 
                                    //	func doesNotUnderstand: (String methodName, Array<Array<Dyn>> args)
                                    java.lang.reflect.Method tmp565 = CyanRuntime.getJavaMethodByName(tmp556.getClass(), "_doesNotUnderstand_2", 2);
                                    if ( tmp565 == null ) {
                                        throw new ExceptionContainer__( new _ExceptionDoesNotUnderstand(new CyString("doesNotUnderstand") ) );
                                    }
                                    try {
                                        _Array_LT_GP__Array_LT_GP_Object_GT_GT arrayArrayParam = new _Array_LT_GP__Array_LT_GP_Object_GT_GT();
                                        _Array_LT_GP_Object_GT arrayParam = new _Array_LT_GP_Object_GT();
                                        arrayParam._add_1(tmp558);
                                        arrayArrayParam._add_1( arrayParam );
                                        tmp565.setAccessible(true);
                                        tmp563 = tmp565.invoke(tmp556, new CyString(tmp559), arrayArrayParam);
                                    }
                                    catch ( java.lang.reflect.InvocationTargetException tmp566 ) {
                                    	Throwable t__ = tmp566.getCause();
                                    	if ( t__ instanceof ExceptionContainer__ ) {
                                        	throw new ExceptionContainer__( ((ExceptionContainer__) t__).elem );
                                    	}
                                    	else
                                    		throw new ExceptionContainer__( new _ExceptionJavaException(t__));
                                    }
                                    catch (IllegalAccessException | IllegalArgumentException tmp566) {
                                            throw new ExceptionContainer__( new _ExceptionDoesNotUnderstand(new CyString(tmp561) ) );
                                    }
                                }
                                java.lang.reflect.Method tmp567 = CyanRuntime.getJavaMethodByName(tmp563.getClass(), "_print", 0);
                                if ( tmp567 == null ) { tmp567 = CyanRuntime.getJavaMethodByName(tmp563.getClass(), "print", 0); }
                                Object tmp568 = null;
                                if ( tmp567 != null ) { 
                                    try {
                                        tmp567.setAccessible(true);
                                        if ( tmp567.getReturnType() == void.class ) {
                                            tmp568 = _Nil.prototype;
                                            tmp567.invoke(tmp563);
                                        }
                                        else {
                                            tmp568 = tmp567.invoke(tmp563);
                                        }
                                    }
                                    catch ( java.lang.reflect.InvocationTargetException tmp569 ) {
                                    	Throwable t__ = tmp569.getCause();
                                    	if ( t__ instanceof ExceptionContainer__ ) {
                                        	throw new ExceptionContainer__( ((ExceptionContainer__) t__).elem );
                                    	}
                                    	else
                                    		throw new ExceptionContainer__( new _ExceptionJavaException(t__));
                                    }
                                    catch (IllegalAccessException | IllegalArgumentException tmp569) {
                                            throw new ExceptionContainer__( new _ExceptionDoesNotUnderstand(new CyString("print") ) );
                                    }
                                }
                                else { 
                                    //	func doesNotUnderstand: (String methodName, Array<Array<Dyn>> args)
                                    java.lang.reflect.Method tmp570 = CyanRuntime.getJavaMethodByName(tmp563.getClass(), "_doesNotUnderstand_2", 2);
                                    if ( tmp570 == null ) {
                                        throw new ExceptionContainer__( new _ExceptionDoesNotUnderstand(new CyString("doesNotUnderstand") ) );
                                    }
                                    try {
                                        _Array_LT_GP__Array_LT_GP_Object_GT_GT arrayArrayParam = new _Array_LT_GP__Array_LT_GP_Object_GT_GT();
                                        _Array_LT_GP_Object_GT arrayParam = new _Array_LT_GP_Object_GT();
                                        arrayArrayParam._add_1( arrayParam );
                                        tmp570.setAccessible(true);
                                        tmp568 = tmp570.invoke(tmp563, new CyString("print"), arrayArrayParam);
                                    }
                                    catch ( java.lang.reflect.InvocationTargetException tmp571 ) {
                                    	Throwable t__ = tmp571.getCause();
                                    	if ( t__ instanceof ExceptionContainer__ ) {
                                        	throw new ExceptionContainer__( ((ExceptionContainer__) t__).elem );
                                    	}
                                    	else
                                    		throw new ExceptionContainer__( new _ExceptionJavaException(t__));
                                    }
                                    catch (IllegalAccessException | IllegalArgumentException tmp571) {
                                            throw new ExceptionContainer__( new _ExceptionDoesNotUnderstand(new CyString("_print") ) );
                                    }
                                }
                                _Nil tmp572 = _Nil.prototype;
                                (new CyString(" "))._print();
                            }
                        }
                    }
                }
            }
        }
        return ;
        } 

    public void _ex1() {

        CyString _s;
        _s = (new CyString("+"));

        CyString _mn;
        _mn = (new CyString("substring:"));
        String tmp575 = "";
        tmp575 += ((CyString ) _s).s;
        char tmp576 = tmp575.charAt(0);
        if ( (tmp576 == '_' || Character.isAlphabetic(tmp576) ) && !tmp575.endsWith(":") ) { tmp575 += ":"; }
        String tmp577 =  CyanRuntime.getJavaNameOfMethod(new String[] { ((CyString ) _s).s }, new int[] {1} );
        java.lang.reflect.Method tmp578 = null;
        tmp578 = CyanRuntime.getJavaMethodByName((new CyInt( (int ) 3)).getClass(), tmp577, 1);
        Object tmp579 = null;
        if ( tmp578 != null ) { 
            try {
                tmp578.setAccessible(true);
                if ( tmp578.getReturnType() == void.class ) {
                    tmp579 = _Nil.prototype;
                    tmp578.invoke((new CyInt( (int ) 3)), (new CyInt( (int ) 7)));
                }
                else {
                    tmp579 = tmp578.invoke((new CyInt( (int ) 3)), (new CyInt( (int ) 7)));
                }
            }
            catch ( java.lang.reflect.InvocationTargetException tmp580 ) {
            	Throwable t__ = tmp580.getCause();
            	if ( t__ instanceof ExceptionContainer__ ) {
                	throw new ExceptionContainer__( ((ExceptionContainer__) t__).elem );
            	}
            	else
            		throw new ExceptionContainer__( new _ExceptionJavaException(t__));
            }
            catch (IllegalAccessException | IllegalArgumentException tmp580) {
                    throw new ExceptionContainer__( new _ExceptionDoesNotUnderstand(new CyString(tmp575) ) );
            }
        }
        else { 
            //	func doesNotUnderstand: (String methodName, Array<Array<Dyn>> args)
            java.lang.reflect.Method tmp581 = CyanRuntime.getJavaMethodByName((new CyInt( (int ) 3)).getClass(), "_doesNotUnderstand_2", 2);
            if ( tmp581 == null ) {
                throw new ExceptionContainer__( new _ExceptionDoesNotUnderstand(new CyString("doesNotUnderstand") ) );
            }
            try {
                _Array_LT_GP__Array_LT_GP_Object_GT_GT arrayArrayParam = new _Array_LT_GP__Array_LT_GP_Object_GT_GT();
                _Array_LT_GP_Object_GT arrayParam = new _Array_LT_GP_Object_GT();
                arrayParam._add_1((new CyInt( (int ) 7)));
                arrayArrayParam._add_1( arrayParam );
                tmp581.setAccessible(true);
                tmp579 = tmp581.invoke((new CyInt( (int ) 3)), new CyString(tmp575), arrayArrayParam);
            }
            catch ( java.lang.reflect.InvocationTargetException tmp582 ) {
            	Throwable t__ = tmp582.getCause();
            	if ( t__ instanceof ExceptionContainer__ ) {
                	throw new ExceptionContainer__( ((ExceptionContainer__) t__).elem );
            	}
            	else
            		throw new ExceptionContainer__( new _ExceptionJavaException(t__));
            }
            catch (IllegalAccessException | IllegalArgumentException tmp582) {
                    throw new ExceptionContainer__( new _ExceptionDoesNotUnderstand(new CyString(tmp577) ) );
            }
        }
        _Any tmp583;
        if ( tmp579 instanceof _Any ) 
            tmp583 = (_Any ) tmp579;
        else
            throw new ExceptionContainer__(new _ExceptionCast( new CyString("Cannot cast expression '(3 `s: 7)' to 'cyan.lang.Any' in line 86 of file ProgramMP.cyan") ) );
        _Nil tmp573 = _Nil.prototype;
        _Out.prototype._println_1( tmp583);
        String tmp586 = "";
        tmp586 += ((CyString ) _mn).s;
        char tmp587 = tmp586.charAt(0);
        if ( (tmp587 == '_' || Character.isAlphabetic(tmp587) ) && !tmp586.endsWith(":") ) { tmp586 += ":"; }
        String tmp588 =  CyanRuntime.getJavaNameOfMethod(new String[] { ((CyString ) _mn).s }, new int[] {1} );
        java.lang.reflect.Method tmp589 = null;
        tmp589 = CyanRuntime.getJavaMethodByName((new CyString("abcde")).getClass(), tmp588, 1);
        Object tmp590 = null;
        if ( tmp589 != null ) { 
            try {
                tmp589.setAccessible(true);
                if ( tmp589.getReturnType() == void.class ) {
                    tmp590 = _Nil.prototype;
                    tmp589.invoke((new CyString("abcde")), CyInt.two);
                }
                else {
                    tmp590 = tmp589.invoke((new CyString("abcde")), CyInt.two);
                }
            }
            catch ( java.lang.reflect.InvocationTargetException tmp591 ) {
            	Throwable t__ = tmp591.getCause();
            	if ( t__ instanceof ExceptionContainer__ ) {
                	throw new ExceptionContainer__( ((ExceptionContainer__) t__).elem );
            	}
            	else
            		throw new ExceptionContainer__( new _ExceptionJavaException(t__));
            }
            catch (IllegalAccessException | IllegalArgumentException tmp591) {
                    throw new ExceptionContainer__( new _ExceptionDoesNotUnderstand(new CyString(tmp586) ) );
            }
        }
        else { 
            //	func doesNotUnderstand: (String methodName, Array<Array<Dyn>> args)
            java.lang.reflect.Method tmp592 = CyanRuntime.getJavaMethodByName((new CyString("abcde")).getClass(), "_doesNotUnderstand_2", 2);
            if ( tmp592 == null ) {
                throw new ExceptionContainer__( new _ExceptionDoesNotUnderstand(new CyString("doesNotUnderstand") ) );
            }
            try {
                _Array_LT_GP__Array_LT_GP_Object_GT_GT arrayArrayParam = new _Array_LT_GP__Array_LT_GP_Object_GT_GT();
                _Array_LT_GP_Object_GT arrayParam = new _Array_LT_GP_Object_GT();
                arrayParam._add_1(CyInt.two);
                arrayArrayParam._add_1( arrayParam );
                tmp592.setAccessible(true);
                tmp590 = tmp592.invoke((new CyString("abcde")), new CyString(tmp586), arrayArrayParam);
            }
            catch ( java.lang.reflect.InvocationTargetException tmp593 ) {
            	Throwable t__ = tmp593.getCause();
            	if ( t__ instanceof ExceptionContainer__ ) {
                	throw new ExceptionContainer__( ((ExceptionContainer__) t__).elem );
            	}
            	else
            		throw new ExceptionContainer__( new _ExceptionJavaException(t__));
            }
            catch (IllegalAccessException | IllegalArgumentException tmp593) {
                    throw new ExceptionContainer__( new _ExceptionDoesNotUnderstand(new CyString(tmp588) ) );
            }
        }
        _Any tmp594;
        if ( tmp590 instanceof _Any ) 
            tmp594 = (_Any ) tmp590;
        else
            throw new ExceptionContainer__(new _ExceptionCast( new CyString("Cannot cast expression '(\"abcde\" `mn: 2)' to 'cyan.lang.Any' in line 87 of file ProgramMP.cyan") ) );
        _Nil tmp584 = _Nil.prototype;
        _Out.prototype._println_1( tmp594);
        return ;
        } 

    public @Override main._ProgramMP _prototype() {
         return prototype;
        
        } 

    public @Override main._ProgramMP _clone() {
        
        try {
            return (_ProgramMP ) this.clone(); 
        } catch (CloneNotSupportedException e) { }
        return null;
        
        } 

    public @Override _Array_LT_GP__Tuple_LT_GP__key_GP_CyString_GP__value_GP__Any_GT_GT _getFeatureListNameDoesNotCollide____() {
        _Array_LT_GP__Tuple_LT_GP__key_GP_CyString_GP__value_GP__Any_GT_GT tmp595 = new _Array_LT_GP__Tuple_LT_GP__key_GP_CyString_GP__value_GP__Any_GT_GT();

        return tmp595;
        } 

    public @Override _Array_LT_GP__Any_GT _getAnnotListNameDoesNotCollide____() {
        _Array_LT_GP__Any_GT tmp596 = new _Array_LT_GP__Any_GT();

        return tmp596;
        } 

    public @Override _Array_LT_GP__Tuple_LT_GP__slotName_GP_CyString_GP__key_GP_CyString_GP__value_GP__Any_GT_GT _getSlotFeatureListNameDoesNotCollide____() {
        _Array_LT_GP__Tuple_LT_GP__slotName_GP_CyString_GP__key_GP_CyString_GP__value_GP__Any_GT_GT tmp597 = new _Array_LT_GP__Tuple_LT_GP__slotName_GP_CyString_GP__key_GP_CyString_GP__value_GP__Any_GT_GT();

        _Array_LT_GP__Tuple_LT_GP__slotName_GP_CyString_GP__key_GP_CyString_GP__value_GP__Any_GT_GT _slotFeatureList__name__does__not__collide____;
        _slotFeatureList__name__does__not__collide____ = tmp597;

        return _slotFeatureList__name__does__not__collide____;
        } 
    public static _ProgramMP prototype;

    static final String []fieldList = { "d" };
    static final String []fieldTypeList = { "cyan.lang.Any" };
    public static _Array_LT_GP__Tuple_LT_GP__key_GP_CyString_GP__value_GP__Any_GT_GT featureList = new _Array_LT_GP__Tuple_LT_GP__key_GP_CyString_GP__value_GP__Any_GT_GT();
    public static _Array_LT_GP__Any_GT annotList = new _Array_LT_GP__Any_GT();

    static final _Array_LT_GP__Tuple_LT_GP__slotName_GP_CyString_GP__key_GP_CyString_GP__value_GP__Any_GT_GT slotFeatureList = new _Array_LT_GP__Tuple_LT_GP__slotName_GP_CyString_GP__key_GP_CyString_GP__value_GP__Any_GT_GT();
    static CyString []methodNameList = { 
        new CyString("toJson: Any -> String"),
        new CyString("_getMethodName: String -> String"),
        new CyString("getSomething4 -> Any"),
        new CyString("ex3 -> Nil"),
        new CyString("ex2 -> Nil"),
        new CyString("ex1 -> Nil"),
        new CyString("prototype -> main.ProgramMP"),
        new CyString("clone -> main.ProgramMP"),
        new CyString("getFeatureListNameDoesNotCollide__ -> Array<Tuple<key,String,value,Any>>"),
        new CyString("getAnnotListNameDoesNotCollide__ -> Array<Any>"),
        new CyString("getSlotFeatureListNameDoesNotCollide__ -> Array<Tuple<slotName,String,key,String,value,Any>>")
        };
    @Override protected CyString [] getMethodNameList2() { return methodNameList; }
    @Override protected String [] getFieldList2() { return fieldList; }

    private CyBoolean _eq_1_super__( Object p0 ) { return super._eq_1( p0 ); }
    private CyBoolean _neq_1_super__( Object p0 ) { return super._neq_1( p0 ); }
    private _Any _prototype_super__() { return super._prototype(); }
    private CyString _prototypeName_super__() { return super._prototypeName(); }
    private _Any _prototypeParent_super__() { return super._prototypeParent(); }
    private CyString _prototypePackageName_super__() { return super._prototypePackageName(); }
    private CyBoolean _isInterface_super__() { return super._isInterface(); }
    private CyBoolean _isA_1_super__( _Any p0 ) { return super._isA_1( p0 ); }
    private CyBoolean _notIsA_1_super__( _Any p0 ) { return super._notIsA_1( p0 ); }
    private Object _throw_1_super__( _CyException p0 ) { return super._throw_1( p0 ); }
    private _Any _clone_super__() { return super._clone(); }
    private CyString _plus_plus_super__(_Any _other) { return super._plus_plus(_other); }
    private CyString _asString_super__() { return super._asString(); }
    private CyString _asString_1_super__( CyInt p0 ) { return super._asString_1( p0 ); }
    private CyString _asStringThisOnly_1_super__( CyInt p0 ) { return super._asStringThisOnly_1( p0 ); }
    private CyString _asStringQuoteIfString_super__() { return super._asStringQuoteIfString(); }
    private CyBoolean _equal_equal_super__(Object _other) { return super._equal_equal(_other); }
    private CyBoolean _equal_equal_equal_super__(Object _other) { return super._equal_equal_equal(_other); }
    private CyBoolean _exclamation_equal_equal_super__(Object _other) { return super._exclamation_equal_equal(_other); }
    private CyBoolean _exclamation_equal_super__(Object _other) { return super._exclamation_equal(_other); }
    private CyBoolean _isCase_1_super__( _Any p0 ) { return super._isCase_1( p0 ); }
    private void _assertxx_1_super__( CyBoolean p0 ) { super._assertxx_1( p0 ); }
    private void _assertxx_2_super__( CyBoolean p0, CyString p1 ) { super._assertxx_2( p0, p1 ); }
    private void _print_super__() { super._print(); }
    private void _println_super__() { super._println(); }
    private void _printspc_super__() { super._printspc(); }
    private void _printc_super__() { super._printc(); }
    private _Any _toAny_1_super__( Object p0 ) { return super._toAny_1( p0 ); }
    private _Array_LT_GP__Tuple_LT_GP__key_GP_CyString_GP__value_GP__Any_GT_GT _featureList_super__() { return super._featureList(); }
    private _Array_LT_GP__Tuple_LT_GP__key_GP_CyString_GP__value_GP__Any_GT_GT _featureList_1_super__( CyString p0 ) { return super._featureList_1( p0 ); }
    private _Array_LT_GP__Tuple_LT_GP__slotName_GP_CyString_GP__key_GP_CyString_GP__value_GP__Any_GT_GT _slotFeatureList_super__() { return super._slotFeatureList(); }
    private _Array_LT_GP__Any_GT _annotList_super__() { return super._annotList(); }
    private _Array_LT_GP__Any_GT _annotList_1_super__( CyString p0 ) { return super._annotList_1( p0 ); }
    private Object _doesNotUnderstand_2_super__( CyString p0, _Array_LT_GP__Array_LT_GP_Object_GT_GT p1 ) { return super._doesNotUnderstand_2( p0, p1 ); }
    private _Any _functionForMethod_1_super__( CyString p0 ) { return super._functionForMethod_1( p0 ); }
    private _Any _functionForMethodWithSelf_1_super__( CyString p0 ) { return super._functionForMethodWithSelf_1( p0 ); }
    private CyInt _hashCode_super__() { return super._hashCode(); }
    private _Array_LT_GP_CyString_GT _getMethodNameList_super__() { return super._getMethodNameList(); }
    private _Array_LT_GP_CyString_GT _getFieldNameList_super__() { return super._getFieldNameList(); }
    private _Array_LT_GP__Tuple_LT_GP__key_GP_CyString_GP__value_GP__Any_GT_GT _getFeatureListNameDoesNotCollide_____super__() { return super._getFeatureListNameDoesNotCollide____(); }
    private _Array_LT_GP__Any_GT _getAnnotListNameDoesNotCollide_____super__() { return super._getAnnotListNameDoesNotCollide____(); }
    private _Array_LT_GP__Tuple_LT_GP__slotName_GP_CyString_GP__key_GP_CyString_GP__value_GP__Any_GT_GT _getSlotFeatureListNameDoesNotCollide_____super__() { return super._getSlotFeatureListNameDoesNotCollide____(); }
    public String []getFieldTypeList() { 
        return fieldTypeList;
    }
    public String []getFieldList() { 
        return fieldList;
    }
    public String asString(int ident) {
        String s =  "ProgramMP {\n";
        s = s + "super(Any):"  + super.asStringThisOnly( ident + _Any.defaultIdentNumber__ );
        s = s + asStringThisOnly( ident + _Any.defaultIdentNumber__);

        s = s + getWhiteSpaces(ident) + "}\n";
        return s;
    } 
    @Override 
    protected String asStringThisOnly(int ident) {
        String s = getWhiteSpaces(ident);
        s = s + getWhiteSpaces(ident) + "d: " + _d._asString().s + "\n";
        return s;
    } 
    protected _Any parent() {
        return _Any.prototype;
    }
    protected CyString prototypePackage() {
        return new CyString( "main" );
    }
    static final String prototypeName = "ProgramMP";
    @Override     public String getPrototypeName() { return prototypeName; }
    protected boolean isInterface() { return false; }

    @Override public _Array_LT_GP__Tuple_LT_GP__key_GP_CyString_GP__value_GP__Any_GT_GT getFeatureList() { return featureList; }
    @Override public _Array_LT_GP__Tuple_LT_GP__slotName_GP_CyString_GP__key_GP_CyString_GP__value_GP__Any_GT_GT getSlotFeatureList() { return slotFeatureList; }
    @Override public _Array_LT_GP__Any_GT getAnnotList() { return annotList; }
    static {
    }

}
