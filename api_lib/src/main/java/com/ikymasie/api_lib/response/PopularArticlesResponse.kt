import com.google.gson.annotations.SerializedName

data class PopularArticlesResponse (

	@SerializedName("status") val status : String,
	@SerializedName("copyright") val copyright : String,
	@SerializedName("num_results") val num_results : Int,
	@SerializedName("results") val results : List<Results>
)