public class Movie {
    
    private String name;
    private String format;
    private double rating;

    public Movie(String name, String format, double rating) {
        setName(name);
        setFormat(format);
        setRating(rating);
    }

    public Movie(Movie source) {
        this.name = source.name;
        this.format = source.format;
        this.rating = source.rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        // TODO
        if(name==null || name.isEmpty())
        throw new IllegalArgumentException("Name can't be a null or empty.");
       else 
       this.name = name;
    }
    
    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        // TODO
        if(format==null || format.isEmpty())
        throw new IllegalArgumentException("Format can't be a null or empty.");
       else 
       this.format = format;
        
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        // TODO
        if(rating<0 || rating>10)
        throw new IllegalArgumentException("Rating must be between 0 and 10.");
       else 
       this.rating = rating;
    }

    public String toString() {
        return this.rating + "\t" + this.format + "\t\t" + this.name + "";
    }    

}