// !CHECK_TYPE

/*
 * KOTLIN DIAGNOSTICS SPEC TEST (POSITIVE)
 *
 * SECTIONS: constant-literals, real-literals
 * PARAGRAPH: 5
 * SENTENCE: [1] A real literal without the type suffix has type kotlin.Double, a real literal with the type suffix has type kotlin.Float.
 * NUMBER: 1
 * DESCRIPTION: A type checking of a simple real literal (with/without underscores).
 */

// TESTCASE NUMBER: 1
val value_1 = 0.1 checkType { _<Double>() }

// TESTCASE NUMBER: 2
val value_2 = 0.1234567890 checkType { _<Double>() }

// TESTCASE NUMBER: 3
val value_3 = -0.99___99999999 checkType { _<Double>() }

// TESTCASE NUMBER: 4
val value_4 = -1111111111.9_9_9_9_9_9_9_9_9_9 checkType { _<Double>() }

// TESTCASE NUMBER: 5
val value_5 = 6_6_6_6_6_6_6_6_6_6.0000000000 checkType { _<Double>() }

// TESTCASE NUMBER: 6
val value_6 = 66666666666666666666666666666666666666666666666666.000000000000000000000000000_____000000000000000000000001 checkType { _<Double>() }

// TESTCASE NUMBER: 7
val value_7 = 0.0 checkType { _<Double>() }

// TESTCASE NUMBER: 8
val value_8 = -0.0________0_______0______0_____0____0___0__0_0 checkType { _<Double>() }

// TESTCASE NUMBER: 9
val value_9 = 0.0000000000 checkType { _<Double>() }

// TESTCASE NUMBER: 10
val value_10 = 0.00000000000000000000000000__________________________________________________________________________________________00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000 checkType { _<Double>() }

// TESTCASE NUMBER: 11
val value_11 = -0.00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001 checkType { _<Double>() }

// TESTCASE NUMBER: 12
val value_12 = <!FLOAT_LITERAL_CONFORMS_ZERO!>0.000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001<!> checkType { _<Double>() }

// TESTCASE NUMBER: 13
val value_13 = -99999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999.0 checkType { _<Double>() }

// TESTCASE NUMBER: 14
val value_14 = <!FLOAT_LITERAL_CONFORMS_INFINITY!>222222222222222222___222222222222222222222___222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222.0<!> checkType { _<Double>() }