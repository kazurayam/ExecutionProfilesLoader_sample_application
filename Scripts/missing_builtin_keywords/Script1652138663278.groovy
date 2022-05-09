import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

println "GlobalVariable.URL=" + GlobalVariable.URL

WebUI.loadExecutionProfile("ProductionEnv")
println "GlobalVariable.URL=" + GlobalVariable.URL
