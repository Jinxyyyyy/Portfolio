<p align="center">
  <img src="PythonFolder/PythonProjects/diabetic-rhinopathy-ml/kaggle2/disease_stages.png" width="500" title="Aperçu du fond d'oeil">
</p>


# Compétition 2 : Prédiction de la Diabetic Rhinopathy

## 1. Description

Dans ce projet, vous participerez à une compétition Kaggle de classification d’images rétiniennes.  
L’objectif est de développer un modèle d’apprentissage automatique capable d’évaluer la gravité de la rétinopathie diabétique à partir de photographies du fond d’œil.  

Le fond d’œil, situé à l’arrière de l’œil, contient la rétine où apparaissent les signes de la maladie.  
Votre but est de classer chaque image dans l’un des niveaux de sévérité fournis.  
Bien que ces distinctions soient souvent subtiles et difficiles à repérer à l’œil nu, les modèles d’apprentissage automatique peuvent saisir des motifs complexes et de grande dimension, permettant d’obtenir des prédictions précises.

### Données fournies

- **train_data.pkl** : contient les images et les étiquettes du training set.  
- **test_data.pkl** : contient les images de l’ensemble de test (sans labels).

#### Exemple pour charger les données en Python

```python
import pickle

# Load the pickle file
with open('path_to_file.pkl', 'rb') as f:
    data = pickle.load(f)

# Access images and labels
images = data['images']
labels = data['labels']
```
## 2. Inscription des équipes (22 novembre)
Créer un compte Kaggle si vous n’en avez pas.

Rejoindre la compétition via ce lien : Kaggle Competition

Ajouter vos coéquipiers ou le nom de votre équipe dans la section "Invite Others".

Remplir le formulaire Google : Formulaire Google

Important : utiliser votre email institutionnel.

Remarque sur les soumissions : maximum 3 soumissions par jour et par équipe.

## 3. Jalons du projet
Premier jalon : Battre le score de référence (30 novembre) [50 pts]
Battre les deux modèles de référence pour obtenir la note maximale.

Petite dataset (<1k examples).

Implémentation à partir de zéro, sans bibliothèques d’apprentissage automatique (uniquement NumPy et Python).

Deuxième jalon : Compétition (8 décembre)
Utilisation libre de bibliothèques (scikit-learn, PyTorch, TensorFlow…).

Les scores publics/privés de Kaggle sont utilisés pour éviter le surapprentissage.

Troisième jalon : Soumettre le code et le rapport (12 décembre) [40 pts]
Rapport détaillant :

Pipeline d’apprentissage

Prétraitement

Algorithmes

Optimisation et apprentissage

Réglage des hyperparamètres et validation

Contenu obligatoire :

Titre du projet

Nom de l’équipe sur Kaggle et membres

Introduction

Conception des caractéristiques

Algorithmes

Méthodologie

Résultats

Discussion

Références

Annexe optionnelle (détails supplémentaires)

Soumissions :

Fichiers .py / notebooks distincts pour chaque jalon

Rapport PDF

Fichier de prédictions CSV pour Kaggle

## 4. Critères d’évaluation
Premier jalon : 50 points

20 points : Battre le modèle de référence aléatoire

30 points : Battre le modèle de référence solide

Deuxième jalon : 10 points

5 points : Performance au-dessus de la médiane

5 points : Top-3 classement

Rapport : 40 points

## 5. Instructions de soumission
Fichiers .py / notebooks distincts pour premier et deuxième jalons

Code bien documenté

Rapport PDF selon la structure décrite

Fichier de prédictions CSV pour Kaggle uniquement

Soumission finale sur Gradescope pour le rapport et le code

## 6. Dates limites
Date	Événement
22 novembre, 23:59	Former les équipes et s’inscrire sur Kaggle
30 novembre, 23:59	Battre les modèles de référence
8 décembre, 23:59	Fin de la compétition Kaggle
12 décembre, 23:59	Soumettre le code et le rapport sur Gradescope
