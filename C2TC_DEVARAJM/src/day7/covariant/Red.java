package day7.covariant;
class Red extends Color {
	@Override
	public Red getColor() {
		Red s = new Red();
		return s;
	}
}
