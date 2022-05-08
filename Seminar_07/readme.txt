Always override toString(), "=", clone and GetHash methods when creating a new class.

Problem:
1. All characters have a 3D graphic model
- instances of the same character can appear in the game
- creating the 3D model is an expensive process because it involves loading and generating the model;
- an efficient solution must be found to create several instances of the same character'