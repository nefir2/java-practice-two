public class vec2 {
	private float x, y;
	public float getX() { return x; }
	public float getY() { return y; }
	public void setX(float x) { this.x = x; }
	public void setY(float y) { this.y = y; }

	public vec2(float value) {
		x = value;
		y = value;
	}
	public vec2(float x, float y) {
		this.x = x;
		this.y = y;
	}
	public vec2 plus(vec2 other) { return new vec2(this.x + other.x, this.y + other.y); }
	public vec2 minus(vec2 other) { return new vec2(this.x - other.x, this.y - other.y); }
	public vec2 multiply(vec2 other) { return new vec2(this.x * other.x, this.y * other.y); }
	public vec2 divide(vec2 other) { return new vec2(this.x / other.x, this.y / other.y); }
}