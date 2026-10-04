# 🎵 Anghami Plus Patches

Morphe patches for [Anghami](https://play.google.com/store/apps/details?id=com.anghami) (`com.anghami`).

## ❓ About

Client-side patches for Anghami **8.0.28** (versionCode `8000280`, APKM) that relax
locally-enforced gates: Plus checks, playback/download restrictions, forced shuffle,
upgrade upsell UI, in-house ads, and Gold-gated rows. Everything here hooks **local
boolean gates** — stream/download URLs, audio quality authorization, and plan data
from `/authenticate` remain server-enforced, so anything the server refuses still
fails after patching.

### How to use these patches

Click here to add these patches to Morphe: https://morphe.software/add-source?github=Kero309x/anghamiplus-patches

Then in Morphe Manager (Expert Mode): pick the stock `base.apk` + matching
`arm64_v8a` + dpi splits (or a merged APK), select the patches below, and install.
All patches are enabled by default (`default=true`) — disable any you don't need.

## 🩹 Patches list

<!-- PATCHES_START EXPANDED -->
> **[v1.0.0](https://github.com/Kero309x/anghamiplus-patches/releases)**&nbsp;&nbsp;•&nbsp;&nbsp;`main`&nbsp;&nbsp;•&nbsp;&nbsp;13 patches total
<details open>
<summary>📦 Anghami&nbsp;&nbsp;•&nbsp;&nbsp;13 patches</summary>
<br>

**🎯 Supported versions:**

| 8.0.28 |
| :---: |

| 💊&nbsp;Patch | 📜&nbsp;Description | ⚙️&nbsp;Options |
|----------|----------------|-----------|
| [Block Audio Ads](#block-audio-ads) | Prevents audio advertisements between songs and treats playback tracks as ad-free. |  |
| [Block Promotional Popups](#block-promotional-popups) | Blocks startup popup offers, promotional flyers, and marketing dialogs. |  |
| [Hide Upgrade Banners](#hide-upgrade-banners) | Hides navigation upgrade tab, header promo banners, and feed subscription upsell cards. |  |
| [Hide Gold Upsell](#hide-gold-upsell) | Hides Gold-tier promotional sections and unsupported server-gated features. |  |
| [Hide Shuffle Badges](#hide-shuffle-badges) | Hides 'Plays in shuffle' badges from playlists, album headers, and feed rows. |  |
| [Hide Premium Feature Buttons](#hide-premium-feature-buttons) | Hides locked upsell buttons including Sing Along (Karaoke) and AI Mix triggers. |  |
| [Disable Forced Shuffle](#disable-forced-shuffle) | Disables forced shuffle mode on playlists and radio, enabling full on-demand song selection. |  |
| [Unlock Plus Experience](#unlock-plus-experience) | Enables client-side Plus features, eliminates free-tier playback restrictions, and enables offline UI mode. |  |
| [Unlimited Track Skips](#unlimited-track-skips) | Removes song skip limitations and queue navigation restrictions. |  |
| [Expand Download Limits](#expand-download-limits) | Removes local offline storage caps and disables limited-plan quota checks. |  |
| [Show Profile Plus Badge](#show-profile-plus-badge) | Displays the official Plus badge on your profile header and account settings. |  |
| [Disable Analytics & Crash Logging](#disable-analytics--crash-logging) | Disables third-party trackers, in-house user activity logging (Silo), and Bugsnag crash reporting. |  |
| [Spoof App Signature](#spoof-app-signature) | Emulates official application signature headers to preserve API authorization compatibility. |  |

</details>

<!-- PATCHES_END -->

### 🎯 Compatibility

| App | Package | Version | File type |
|-----|---------|---------|-----------|
| Anghami | `com.anghami` | 8.0.28 (8000280, all ABIs) | APKM |

Fingerprints pin 8.0.28 method shapes — re-verify them against a fresh decode
before using these patches on any other app version.

### 🛠️ Building locally

- Run `./gradlew buildAndroid`
  (needs JDK 17+ and a GitHub PAT with `read:packages`, e.g. via `GITHUB_ACTOR` / `GITHUB_TOKEN`, for the Morphe registry)
- The built patches `.mpp` file is found in `patches/build/libs/patches-*.mpp`
- Apply the `.mpp` with [Morphe-Desktop](https://github.com/MorpheApp/morphe-desktop)
  like any other patch bundle

See the [Morphe documentation](https://github.com/MorpheApp/morphe-documentation) for more information.

## ⚠️ Disclaimer

For research and interoperability purposes. Spoofing entitlement on a commercial
streaming service can violate its Terms of Service — use a throwaway account,
expect server-gated features (full lyrics, high-quality streams, downloads) to
keep failing, and do not redistribute patched APKs as "Premium Unlocked".

## 👥 Contributors

* **[Kero309x](https://github.com/Kero309x)** — Project Creator, Lead Developer & Reverse Engineer
* **Gemini (Google DeepMind)** — AI Architecture, Bytecode Analysis & Pair Programming

## 📜 License

Anghami Plus Patches are licensed under the [GNU General Public License v3.0](LICENSE)

