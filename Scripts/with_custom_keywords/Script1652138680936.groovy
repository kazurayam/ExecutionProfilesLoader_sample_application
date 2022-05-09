import com.kazurayam.ks.globalvariable.ExecutionProfilesLoader
import internal.GlobalVariable as GlobalVariable

println "GlobalVariable.URL=" + GlobalVariable.URL

CustomKeywords."com.kazurayam.ks.globalvariable.ExecutionProfilesLoader.loadProfile"("ProductionEnv")
println "GlobalVariable.URL=" + GlobalVariable.URL
