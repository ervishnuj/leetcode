class PathCrossing {
    public boolean isPathCrossing(String path) {
        
        
        
        Set<String> visited = new HashSet<>();

        int x = 0;
        int y = 0;

        // Add starting coordinate (0, 0)
        visited.add(x + "," + y);

        for (char dir : path.toCharArray()) {
            switch (dir) {
                case 'N' -> y++;
                case 'S' -> y--;
                case 'E' -> x++;
                case 'W' -> x--;
            }

            String currentCoord = x + "," + y;

            // If coordinate was already visited, path crosses itself
            if (!visited.add(currentCoord)) {
                return true;
            }
        }

        return false;
    

   
    }
}