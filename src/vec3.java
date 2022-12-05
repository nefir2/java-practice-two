public class vec3 {
	private float x, y, z;

	public float getX() { return x; }
	public float getY() { return y; }
	public float getZ() { return z; }
	public void setX(float x) { this.x = x; }
	public void setY(float y) { this.y = y; }
	public void setZ(float z) { this.z = z; }

	public vec3(float value) {
		this.x = value;
		this.y = value;
		this.z = value;
	} //vec3(float _value) : x(_value), y(_value), z(_value) {};
	public vec3(float x, vec2 v) {
		this.x = x;
		this.y = v.getX();
		this.z = v.getY();
	} //vec3(float _x, vec2 const& v) : x(_x), y(v.x), z(v.y) {};
	public vec3(float x, float y, float z) {
		this.x = x;
		this.y = y;
		this.z = z;
	} //vec3(float _x, float _y, float _z) : x(_x), y(_y), z(_z) {};

	public vec3 plus(vec3 other) { return new vec3(this.x + other.x, this.y + other.y, this.z + other.z); } //vec3 operator+(vec3 const& other) { return vec3(x + other.x, y + other.y, z + other.z); }
	public vec3 minus(vec3 other) { return new vec3(this.x - other.x, this.y - other.y, this.z - other.z); } //vec3 operator-(vec3 const& other) { return vec3(x - other.x, y - other.y, z - other.z); }
	public vec3 multiply(vec3 other) { return new vec3(this.x * other.x, this.y * other.y, this.z * other.z); } //vec3 operator*(vec3 const& other) { return vec3(x * other.x, y * other.y, z * other.z); }
	public vec3 divide(vec3 other) { return new vec3(this.x - other.x, this.y - other.y, this.z - other.z); } //vec3 operator/(vec3 const& other) { return vec3(x / other.x, y / other.y, z / other.z); }
	public vec3 minus() { return new vec3(-this.x, -this.y, -this.z); } //vec3 operator-() { return vec3(-x, -y, -z); }
}
