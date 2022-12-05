public class VecFunctions {
	//public double sign(double a) { return (0 < a) - (a < 0); } //??
	//public double step(double edge, double x) { return x > edge; } //?????

	public static float length(vec2 v) { return Double.valueOf(Math.sqrt(v.getX() * v.getX() + v.getY() * v.getY())).floatValue(); }
	public static float length(vec3 v) { return Double.valueOf(Math.sqrt(v.getX() * v.getX() + v.getY() * v.getY() + v.getZ() * v.getZ())).floatValue(); }

	public static vec3 norm(vec3 v) { return v.divide(new vec3(length(v))); }

	public static float dot(vec3 a, vec3 b) { return a.getX() * b.getX() + a.getY() * b.getY() + a.getZ() * b.getZ(); }
	//public vec3 abs()

	public static vec2 sphere(vec3 ro, vec3 rd, float r) {
		float b = dot(ro, rd);
		float c = dot(ro, ro) - r * r;
		float h = b * b - c;
		if (h < 0.0f) return new vec2(-1.0f);
		h = Double.valueOf(Math.sqrt(h)).floatValue();
		return new vec2(-b - h, -b + h);
	}
}
