package hn.edu.ujcv.pdm_2021_iii_p3_investigacion3

actual class Platform actual constructor() {
    actual val platform: String = "Android ${android.os.Build.VERSION.SDK_INT}"
}