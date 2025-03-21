enum Movie {
    VISIRI,
    ANAL,
    KAGAZ,
    PS1,
    RUN;
}

 class MovieInfo {
    public static void main(String[] args) {
        Movie selectedMovie = Movie.VISIRI;
        
        String directorName = getDirectorByMovie(selectedMovie);
        
        System.out.println("Movie: " + selectedMovie);
        System.out.println("Director: " + directorName);
    }

    public static String getDirectorByMovie(Movie movie) {
        if (movie == Movie.VISIRI) {
            return "Lokesh Kanagaraj";
        } else if (movie == Movie.ANAL) {
            return "Lokesh Kanagaraj";
        } else if (movie == Movie.KAGAZ) {
            return "Nelson Dilipkumar";
        } else if (movie == Movie.PS1) {
            return "Mani Ratnam";
        } else if (movie == Movie.RUN) {
            return "Lokesh Kanagaraj";
        } else {
            return "Unknown Director";
        }
    }
}