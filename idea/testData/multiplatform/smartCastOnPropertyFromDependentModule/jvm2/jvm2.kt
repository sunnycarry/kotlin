fun test(fromCommon: CommonDataClass, fromJvm: JvmDataClass) {
    if (fromCommon.property != null) {
        <!DEBUG_INFO_SMARTCAST!>fromCommon.property<!>.doSomething()
    }

    if (fromJvm.property != null) {
        <!SMARTCAST_IMPOSSIBLE!>fromJvm.property<!>.doSomething()
    }
}